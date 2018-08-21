package loginredirecttest

import com.loginredirecttest.User

class BootStrap {

    def init = { servletContext ->
        new User(username: 'root', password: 'root').save(flush: true)
    }
    def destroy = {
    }
}
