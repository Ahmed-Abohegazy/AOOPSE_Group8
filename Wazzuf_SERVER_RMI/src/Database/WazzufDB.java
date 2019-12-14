/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import server_Client_Classes.JobSeeker;

/**
 *
 * 
 */
public class WazzufDB {

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> JobseekerCol;
    private MongoCollection<Document> CompanyCol;
    private MongoCollection<Document> AdminCol;
    private Gson gson = new Gson();

    public WazzufDB() {
       this.client = new MongoClient("localhost",27017);
       this.database = client.getDatabase("WazufDB"); // Database name
       this.JobseekerCol = database.getCollection("JobseekerCol"); // Collection name
        this.CompanyCol = database.getCollection("CompanyCol"); // Collection name
        this.AdminCol = database.getCollection("AdminCol"); // Collection name
    }
//
    public void insertJobseeker(JobSeeker s) {
        //s = gson.fromJson(doc.toJson(), Student.class);
        JobseekerCol.insertOne(Document.parse(gson.toJson(s)));
        System.out.println("Jobseeker: " + s.getName() + " Added");

    }
//
//    public void deleteStudent(String email, Student s) {
//    boolean result = collection.deleteOne(Filters.eq(s.getEmail(), email)).wasAcknowledged();
//    }
//
//    public Student getStudentByMail(String email) {
//        
//     Document doc1 = collection.find(Filters.eq("Email", email)).first();
//     Student x = gson.fromJson(doc1.toJson(), Student.class);
//     return x;
//        }
//
//    public ArrayList<Student> getStudentsByYear(int year) {
//        
//           ArrayList<Document> doc2 = new ArrayList<Document>();
//        ArrayList<Student> stud = new ArrayList<Student>();
//          doc2 = collection.find(Filters.eq("year", year)).into( doc2);  
//        for (int i = 0; i < doc2.size(); i++) {
//     
//        Student x = gson.fromJson(doc2.get(i).toJson(), Student.class);
//          stud.add(x);
//        System.out.println(x.getName()+ " and " + x.getYear());
//        }
//     
//      return stud;
//     
//    }
//
////    public ArrayList<Student> getStudentsByYearLT(int year) {
////
////    }
//
//    public ArrayList<Student> getStudentsByCourse(String courseID) {
//        ArrayList<Document> doc2 = new ArrayList<Document>();
//        ArrayList<Student> stud = new ArrayList<Student>();
//          doc2 = collection.find(Filters.eq("courses", courseID)).into( doc2 );  
//      for (int i = 0; i < doc2.size(); i++) {
//          
//            Student x = gson.fromJson(doc2.get(i).toJson(), Student.class);
//            stud.add(x);
//            System.out.println(x.getName()+ " and " + x.getCourses());
//        }
//     return stud;
//    }
//
//    public ArrayList<Student> getAllStudents() {
//                ArrayList<Document> doc2 = new ArrayList<Document>(); 
//                 ArrayList<Student> result = new ArrayList<Student>(); 
//                
//         doc2 = collection.find().into(new ArrayList<Document>());
//         
//         
//       for (int i = 0; i < doc2.size(); i++) {
//           
//           result.add( gson.fromJson(doc2.get(i).toJson(), Student.class));
//        }
//     return result;
//    }
//
//    public void updateStudent(Student s , Student q) {
//        
//       Document doc1 = Document.parse(gson.toJson(q));
//       
//    boolean result = collection.replaceOne(Filters.eq("name", s.getName()), doc1).wasAcknowledged();
//        System.out.println("Student list Updated.");
//    }



}
