package com.senai.sharedpreferences.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.senai.sharedpreferences.database.DatabaseHelper;
import com.senai.sharedpreferences.entities.Student;

public class StudentController {

    private SQLiteDatabase db;
    private DatabaseHelper databaseHelper;

    public StudentController(Context context){
        this.databaseHelper = new DatabaseHelper(context);
    }

    //Método para cadastrar um student
    public String save(Student student){
        ContentValues values;

        db = databaseHelper.getWritableDatabase();
        values = new ContentValues();
        values.put("nome", student.getName());
        values.put("email", student.getEmail());
        values.put("senha", student.getSenha());

        long result = db.insert("student", null, values);

        if (result == -1){
            return "ERROR TO SAVE STUDENT";
        }else{
            return "STUDENT SAVED SUCESSFULLY";
        }
    }
}
