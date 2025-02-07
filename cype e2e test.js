// project login page test script

describe('Expertizo University Portal', () => {

    beforeEach(() => {
      cy.visit('/')
    })
  
    it('should load the homepage', () => {
      cy.get('title').should('exist')
    })
  
    it('should have a login form', () => {
      cy.get('form').should('exist')
    })
  
    it('should have email', () => {
      cy.get('input[name= "email"]').should ('exist').and ('be.visible')
  
    })
  
    it('should have a login button', () => {
      cy.get('button[type="submit"]').should('exist').and ('be.visible')
    })
      it('should allow with valid email and navigate to personal info page', () => {
        cy.get('input[name= "email"]',{timeout:10000}).type('sqaaisha25@gmail.com')
        cy.get('button[type="submit"]').click()
        cy.go('back')
        cy.wait(10000)
      })
    const invalidEmails=[
      'sqaaisha.com',
      'sqaaisha@',           
      '@gmail.com',       
      'aisha@.com' ,         
      'sqa@com',           
      '@@@@@@gmail.com',   
      'sqaaisha@gmail.c',      
      'ai@gmail#com',
       '',
      '   ',
      '..........@gmail.com',
      'sqaaisha@ایمیل.com',
    ]
    invalidEmails .forEach((email)=>{
      it('should display an error for invalid email:${email}',()=>{
        cy.get('input[name= "email"]').clear()
  
        if(email.trim()!== ''){
          cy.get('input[name= "email"]').type(email)
        }
        if(email.trim()=== ''){
          cy.get('input[name= "email"]').type(' ')
        }
        cy.get('button[type="submit"]').click()
        cy.wait(12000)
        cy.get('span[class="error-message"]').should('exist').and('be.visible')
      })
  
    })
      it('should display an error if the non-existent gmail is used',()=>{
        cy.get('input[name= "email"]').type('aisha123@gmail.com')
        cy.get('button[type="submit"]').click()
        cy.wait(12000)
        cy.get('span[class="error-message"]').should('exist').and('be.visible') 
          
  .then(()=> cy.console.log('test is passed:error message displayed'));
  
      })
  it('should sccept the single character before @',()=>{
  cy.get('input[name= "email"]').clear().type('a@gmail.com')
  cy.get('button[type="submit"]').click()
  cy.wait(10000)
  cy.get('label[for="female"]').click()
  console.log('test is pass:element found')
  
    })
    
    it ('should allow email with 320 character long',()=>{
   const email = 'a'.repeat(64) + '@' + 'b'.repeat(251) + '.com'
  
      cy.get('input[name= "email"]').clear().type(email)
      cy.get('button[type="submit"]').click
      
  
    })
  
  it('should not allow email with 321 character long',()=>{
    const email = 'a'.repeat(64) + '@' + 'b'.repeat(252) + '.com'
   
       cy.get('input[name= "email"]').clear().type(email)
       cy.get('button[type="submit"]').click
  
       cy.get('span[class="error-message"]').should('exist').and('be.visible') 
    
  })
  
    })
  
  
  