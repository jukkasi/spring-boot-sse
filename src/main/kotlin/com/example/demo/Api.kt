package com.example.demo.com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter
import javax.servlet.http.HttpServletResponse

@Controller
class Api {
    @GetMapping("/api/sse")
    fun handle(response: HttpServletResponse): SseEmitter {

        response.setHeader("Cache-Control", "no-store")
        response.setHeader("Cache-Control", "no-transform")

        return SseEmitter()
    }
}
