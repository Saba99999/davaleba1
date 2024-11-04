package com.example.davaleba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.davaleba1.databinding.ActivityGetMessageBinding
import com.example.davaleba1.databinding.ActivitySendMessageBinding

class GetMessage : AppCompatActivity() {

    private lateinit var binding: ActivityGetMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailTextView.text = intent.getStringExtra("email")
        binding.recipientEmailTextView.text = intent.getStringExtra("recipientEmail")
        binding.messageTextView.text = intent.getStringExtra("message")
        
        binding.clear.setOnClickListener{
            binding.recipientEmailTextView.text = ""
            binding.messageTextView.text = ""
            Toast.makeText(this, "cleared successfully", Toast.LENGTH_SHORT).show()
        }


    }

}