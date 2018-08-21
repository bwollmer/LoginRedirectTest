# Unexpected Redirect after login with Grails and SpringSecurityCore

Initial Grails Application with SpringSecurityCore to test the redirect after a login attempt. User root:root will be created on start.

Steps to reproduce unexpected behaviour:

- Start Application
- Navigate to non existing page e.g localhost:8080/blah, you will  Login Page
- Don't login, navagite to startpage (localhost:8080)
- Click on grails.plugin.springsecurity.LoginController
- Login with root:root

Now you are on the non existing page, instead of the exptected startpage

Ticket: https://github.com/grails-plugins/grails-spring-security-core/issues/560
