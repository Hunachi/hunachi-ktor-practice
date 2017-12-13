package io.github.hunachi.hunachiktor

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing


/**
 * Created by hanah on 2017/12/13.
 */
fun Application.hunachiApplication(){
    routing {
        get("/"){
            call.respondText("hunachi")
        }
    }
}