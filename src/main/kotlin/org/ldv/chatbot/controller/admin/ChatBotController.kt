package org.ldv.chatbot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ChatBotController {

    @GetMapping("/")
    fun index(): String {
        return "utilisateur/index"
    }

    @GetMapping("/login")
    fun login(): String {
        return "auth/login"
    }
}