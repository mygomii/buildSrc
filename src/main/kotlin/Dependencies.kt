object Dependencies {
    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.AndroidX.APP_COMPAT}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.CONSTRAINT_LAYOUT}"
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.AndroidX.CORE_KTX}"
        const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.LIFECYCLE_RUNTIME_KTX}"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.AndroidX.ACTIVITY_COMPOSE}"
        const val UI = "androidx.compose.ui:ui"
        const val UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
        const val UI_TOOLING = "androidx.compose.ui:ui-tooling"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
        const val MATERIAL3 = "androidx.compose.material3:material3"
    }

    const val VIEW_MODEL = "org.jetbrains.androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.VIEW_MODEL}"

    object AndroidTest {
        const val UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4"
        const val ANDROID_X_ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.AndroidX.ESPRESSO_CORE}"
    }

//    object Coroutines {
//        const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
//        const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
//    }

    object Ktor {
        const val CLIENT_CORE = "io.ktor:ktor-client-core:${Versions.KTOR}"
        const val CLIENT_ANDROID = "io.ktor:ktor-client-android:${Versions.KTOR}"
        const val CONTENT_NEGOTIATION = "io.ktor:ktor-client-content-negotiation:${Versions.KTOR}"
        const val JSON = "io.ktor:ktor-serialization-kotlinx-json:${Versions.KTOR}"
        const val LOGGING = "io.ktor:ktor-client-logging:${Versions.KTOR}"
        const val OKHTTP = "io.ktor:ktor-client-okhttp:${Versions.KTOR}"
        const val CIO = "io.ktor:ktor-client-cio:${Versions.KTOR}"
    }

    object Koin {
        const val CORE = "io.insert-koin:koin-core:${Versions.Koin.DEFAULT}"
        const val TEST = "io.insert-koin:koin-test:${Versions.Koin.DEFAULT}"
        const val ANDROID = "io.insert-koin:koin-android:${Versions.Koin.DEFAULT}"

        const val COMPOSE = "io.insert-koin:koin-compose:${Versions.Koin.COMPOSE}"
        const val COMPOSE_VIEWMODEL = "io.insert-koin:koin-compose-viewmodel:${Versions.Koin.COMPOSE_VEIWMODEL}"
    }

    object Google {
        const val JSON = "com.google.code.gson:gson:${Versions.JSON}"
    }

    object Media3 {
        const val EXO_PLAYER = "androidx.media3:media3-exoplayer:${Versions.MEDIA3}"
        const val EXO_PLAYER_DASH = "androidx.media3:media3-exoplayer-dash:${Versions.MEDIA3}"
        const val EXO_PLAYER_UI = "androidx.media3:media3-ui:${Versions.MEDIA3}"
        const val SESSION = "androidx.media3:media3-session:${Versions.MEDIA3}"
        const val COMMON = "androidx.media3:media3-common:${Versions.MEDIA3}"
    }

    const val JSON = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
    const val LOGGER = "com.orhanobut:logger:${Versions.LOGGER}"
}
