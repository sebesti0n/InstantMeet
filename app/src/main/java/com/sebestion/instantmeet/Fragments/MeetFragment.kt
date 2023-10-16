package com.sebestion.instantmeet.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sebestion.instantmeet.databinding.FragmentMeetBinding
import org.webrtc.PeerConnection
import org.webrtc.PeerConnectionFactory


class MeetFragment : Fragment() {
    private var _binding: FragmentMeetBinding? = null
    private val binding get() = _binding!!
    private lateinit var peerConnection: PeerConnectionFactory
    lateinit var rtcPeerConnection: PeerConnection
    private lateinit var iceServers: List<PeerConnection.IceServer>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMeetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        iceServers = listOf(
//              stun:stun.services.mozilla.com,
//               "stun:stun.l.google.com:19302"
//            )
//

    }
}

//        fun createPeerConnection() {
//            val rtcConfig = PeerConnection.RTCConfiguration()
//            rtcConfig.iceServers = iceServers
//
//            rtcPeerConnection = RTCPeerConnection(rtcConfig)
//
//            rtcPeerConnection.onicecandidate = { event ->
//                val candidate = event.candidate as RTCIceCandidate
//                onIceCandidate(candidate)
//            }
//
//            rtcPeerConnection.onaddstream = { event ->
//                val stream = event.stream
//                onAddStream(stream)
//            }
//
//            // Assuming you have defined localStream earlier
//            rtcPeerConnection.addStream(localStream)
//        }
//    }
//        fun onIceCandidate(candidate: RTCIceCandidate) {
//            // Handle ICE candidate
//        }
//
//        fun onAddStream(stream: MediaStream) {
//            // Handle added remote stream
//
//    }
