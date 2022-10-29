package com.demo.datadogintegrationdemo

import android.app.Application

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        val configuration = Configuration.Builder(
            logsEnabled = true,
            tracesEnabled = true,
            crashReportsEnabled = true,
            rumEnabled = true
        ).build()
        val clientToken="<CLIENT_TOKEN>"
        val envName="<ENV_NAME>"
        val appVerientName="<APP_VARIANT_NAME>"
        val appID="<APPLICATION_ID>"
        val trackingConsent=TrackingConsent.GRANTED

        val credentials = Credentials(clientToken, envName, appVerientName, appID)
        Datadog.initialize(this, credentials, configuration, trackingConsent)
    }
}