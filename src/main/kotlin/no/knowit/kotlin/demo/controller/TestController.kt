package no.knowit.kotlin.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/test")
class TestController {
    @GetMapping
    fun test(input: String) = "Hei $input"
}