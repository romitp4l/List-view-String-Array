package com.example.list_view_string_array

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    val names = arrayOf(
        "romit", "ashish", "anuj", "kanchan", "alok", "ankit" ,
        "amit", "nidhi", "pankaj", "swati", "rahul", "mohit", "priya", "suman", "vikas", "neha", "rohit", "shweta",
        "arjun", "kavita", "rohan", "deepak", "geeta", "abhishek", "naina", "pawan", "ankita", "gopal", "manoj",
        "rajat", "megha", "ajay", "sonali", "saurabh", "deepika", "sanjay", "jyoti", "anil", "preeti", "suresh",
        "anita", "mukesh", "rashmi", "sumit", "monika", "rakesh", "pallavi", "yogesh", "pooja", "tarun", "kiran",
        "manish", "rekha", "harish", "divya", "rajesh", "sneha", "naveen", "meena", "pradeep", "jyotsna", "mahesh",
        "vidya", "shyam", "sandhya", "sandeep", "usha", "amol", "savita", "ashok", "riya", "aditya", "ruchi",
        "lalit", "rachna", "bikram", "neetu", "shivam", "chitra", "vivek", "seema", "rajesh", "shikha", "keshav",
        "tanvi", "vijay", "sheetal", "bhavesh", "neelam", "ravi", "komal", "jatin", "kanika", "gautam", "meera",
        "jitendra", "sudha", "sachin", "kajal", "devendra", "meenu", "vishal", "kirti", "mayank", "tanu", "umesh",
        "anjali", "manoj", "simran", "parveen", "teena", "yash", "madhu", "vinod", "anuradha", "ranjan", "tanya",
        "madhur", "payal", "pravin", "vandana", "arvind", "garima", "alok", "sujata", "bhaskar", "deeksha", "atul",
        "sana", "chetan", "richa", "ramesh", "vaishali", "ranjeet", "anu", "subhash", "pragati", "sidharth",
        "priyanka", "abhinav", "aarti", "avinash", "shilpa", "deepak", "sweta", "lalit", "alpa", "rohit", "anjana",
        "ankur", "madhu", "hitesh", "pratibha", "amit", "rupa", "kamal", "reshma", "dinesh", "dimple", "gagan",
        "savitri", "amrit", "anuja", "sunil", "shruti", "virendra", "anupama", "kumar", "mala", "dilip", "shreya",
        "vijendra", "raman", "baldev", "krishna", "binod", "shantanu", "nishant", "manisha", "ravi", "kavya", "anish",
        "prashant", "yogita", "lalita", "mahima", "bobby", "keshav", "raman", "tanisha", "ishita", "devesh", "sarita",
        "shiva", "tulika", "puneet", "aditi", "nidhi", "prachi", "santosh", "aastha", "alok", "prerna", "karan",
        "kirti", "keshav", "namita", "punit", "mansi", "gaurav", "shivani", "kunal", "sita", "bhanu", "himani"
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        var lv : ListView = findViewById(R.id.lv)
        var adapter : ArrayAdapter<String> =ArrayAdapter(this , android.R.layout.simple_list_item_1 ,android.R.id.text1 , names)
        lv.adapter = adapter


        // setting onItemView click listener to the individual items of the list
            lv.setOnItemClickListener { parent, view, position, id ->
                 val selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(this, "${position + 1} . ${selectedItem.toString().toUpperCase(Locale.ROOT)} was clicked ",Toast.LENGTH_SHORT).show()

            }





    }
}