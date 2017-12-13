package io.github.hunachi.hunachiktorTest

import io.github.hunachi.hunachiktor.hunachiApplication
import io.ktor.application.Application
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.apache.http.HttpRequest
import org.junit.Test
import kotlin.test.assertEquals

class ApplicationTest{
    @Test fun testHello() = withTestApplication(Application::hunachiApplication){
        handleRequest(HttpMethod.Get, "/").run {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals("hunachi", response.content)
        }
    }
}