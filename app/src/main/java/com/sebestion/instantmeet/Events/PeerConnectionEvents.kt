package com.sebestion.instantmeet.Events

import org.webrtc.IceCandidate
import org.webrtc.RTCStatsReport
import org.webrtc.SessionDescription

interface PeerConnectionEvents {
    fun onLocalDescription(sdp: SessionDescription)
    fun onIceCandidate(candidate: IceCandidate)
    fun onIceCandidatesRemoved(candidates: Array<IceCandidate>)
    fun onIceConnected()
    fun onIceDisconnected()
    fun onConnected()
    fun onDisconnected()
    fun onPeerConnectionClosed()
    fun onPeerConnectionStatsReady(report: RTCStatsReport)
    fun onPeerConnectionError(description: String)
}