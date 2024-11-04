package com.example.davaleba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.davaleba1.databinding.ActivitySendMessageBinding

class SendMessage : AppCompatActivity() {

    private lateinit var binding: ActivitySendMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendButton.setOnClickListener{
            if (binding.emailEditText.text.isEmpty() || binding.recipientEmailEditText.text.isEmpty() || binding.messageEditText.text.isEmpty()){
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.emailEditText.text.contains("@").not()){
                Toast.makeText(this, "Email is not correct", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.recipientEmailEditText.text.contains("@").not()){
                Toast.makeText(this, "Recipient email is not correct", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, GetMessage::class.java)
            intent.putExtra("email", binding.emailEditText.text.toString())
            intent.putExtra("recipientEmail", binding.recipientEmailEditText.text.toString())
            intent.putExtra("message", binding.messageEditText.text.toString())

            startActivity(intent)

        }

    }
}