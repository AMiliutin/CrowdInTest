package com.airslate.crowdintest

import android.app.Application
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig
import com.crowdin.platform.data.model.AuthConfig

class Application: Application() {

    override fun onCreate() {
        super.onCreate()

        Crowdin.init(applicationContext,
            CrowdinConfig.Builder()
                .withDistributionHash("36cf15ae8aeac833ab5fc997zsy")
//                .withNetworkType(network_type)                // optional
//                .withUpdateInterval(interval_in_seconds)      // optional
                .build())

        Crowdin.init(applicationContext,
            CrowdinConfig.Builder()
                .withDistributionHash("36cf15ae8aeac833ab5fc997zsy")
                .withScreenshotEnabled()
                .withRealTimeUpdates()
                .withSourceLanguage("en")
                .withAuthConfig(AuthConfig("LO28EZN82v3znmTboMsB", "Gwih9gDhJ8HEXd4w2bxStjLiOTkIpQ7UBNFN8pvn", null, false))
//                .withNetworkType(network_type)                                           // optional
//                .withUpdateInterval(interval_in_seconds)                                 // optional
                .build())

//crowdintest://ascrowdintest


    }

}