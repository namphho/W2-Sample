package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by nampham on 3/31/21.
 */

@Parcelize
class Student(var firstName: String, var lastName: String, var age: Int, var email: String) : Parcelable{

    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName', age=$age, email='$email')"
    }
}