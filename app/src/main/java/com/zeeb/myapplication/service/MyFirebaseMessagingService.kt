package com.zeeb.myapplication.service

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.zeeb.myapplication.NotificationHelper

class MyFirebaseMessagingService : FirebaseMessagingService() {


    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)

        if (remoteMessage!!.notification != null){
            val title = remoteMessage.notification!!.title
            val body = remoteMessage.notification!!.body


            NotificationHelper.displayNotification(applicationContext, title!!, body!!)
        }

    }
}