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
                .withDistributionHash("d2f5942bd558370aecbee394v56")
//                .withNetworkType(network_type)                // optional
//                .withUpdateInterval(interval_in_seconds)      // optional
                .build())

        Crowdin.init(applicationContext,
            CrowdinConfig.Builder()
                .withDistributionHash("eec91dbe84e27f8ba1329a94v56")
                .withRealTimeUpdates()
                .withSourceLanguage("en")
                .withAuthConfig(AuthConfig("Qsfj9kH01xrxqWXCr3th", "xjBQe4yXwvNJBmcoCja8iRKJjn6N5eUxVho9vMtu", null, false))
//                .withNetworkType(network_type)                                           // optional
//                .withUpdateInterval(interval_in_seconds)                                 // optional
                .build())

//crowdintest://ascrowdintest


    }

}