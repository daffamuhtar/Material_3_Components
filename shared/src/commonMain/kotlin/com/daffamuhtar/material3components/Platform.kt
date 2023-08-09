package com.daffamuhtar.material3components

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform