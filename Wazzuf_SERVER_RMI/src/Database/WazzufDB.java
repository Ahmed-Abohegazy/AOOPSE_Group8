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
import server_Client_Classes.Admin;
import server_Client_Classes.Application;
import server_Client_Classes.Company;
import server_Client_Classes.Job;
import server_Client_Classes.JobSeeker;
import wazzuf_server_rmi.Wazzuf_DB_Interface;

/**
 *
 * 
 */
public class WazzufDB  implements Wazzuf_DB_Interface{

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> JobseekerCol;
    private MongoCollection<Document> CompanyCol;
    private MongoCollection<Document> AdminCol;
     private MongoCollection<Document> APPcol;
      private MongoCollection<Document> JOBCOL;
    private Gson gson = new Gson();

    public WazzufDB() {
       this.client = new MongoClient("localhost",27017);
       this.database = client.getDatabase("WazufDB"); // Database name
       this.JobseekerCol = database.getCollection("JobseekerCol"); // Collection name
        this.CompanyCol = database.getCollection("CompanyCol"); // Collection name
        this.AdminCol = database.getCollection("AdminCol"); // Collection name
        this.APPcol = database.getCollection("APPcol"); // Collection name
        this.JOBCOL = database.getCollection("JOBCOL"); // Collection name
    }
//
    public void insertJobseeker(JobSeeker s) {
        //s = gson.fromJson(doc.toJson(), Student.class);
        Document doc1 = JobseekerCol.find(Filters.eq("useracc.username", s.getUseracc().getUsername())).first();
        
        JobseekerCol.insertOne(Document.parse(gson.toJson(s)));
        System.out.println("Jobseeker: " + s.getUseracc().getUsername() + s.getName() + s.getJSid() + " Added");
    }
    
    public Admin getAdmin(String Username, String Password){
        ArrayList<Document> doc2 = new ArrayList<Document>();
        ArrayList<Admin> result = new ArrayList<Admin>();
        doc2 = AdminCol.find().into(new ArrayList<Document>());
          Admin x = new Admin();
         boolean isFound = false;
       for (int i = 0; i < doc2.size(); i++) {
           
           result.add( gson.fromJson(doc2.get(i).toJson(), Admin.class));
        }
        for (int i = 0; i < result.size(); i++) {
//         if(result.get(i).getUseracc().getUsername().equals(Username)){
           x = result.get(i);
          return x;     
    
   //         }
        }
        return null;
    }
    public JobSeeker getJobSeeker(String Username, String Password){
         ArrayList<Document> doc2 = new ArrayList<Document>(); 
         ArrayList<JobSeeker> result = new ArrayList<JobSeeker>(); 
         doc2 = JobseekerCol.find().into(new ArrayList<Document>());
          JobSeeker x = new JobSeeker();
         boolean isFound = false;
       for (int i = 0; i < doc2.size(); i++) {
           
           result.add( gson.fromJson(doc2.get(i).toJson(), JobSeeker.class));
        }
        for (int i = 0; i < result.size(); i++) {
         if(result.get(i).getUseracc().getUsername().equals(Username)){
           x = result.get(i);
          return x;     
           
            
        }
        }
         //Document jbsobj = JobseekerCol.find( Filters.eq("useracc"));
        
     return x;
    
    
    }
    
    public JobSeeker updateJobSeeker(JobSeeker s, JobSeeker y){
    Document doc1 = Document.parse(gson.toJson(y));
    JobSeeker x = new JobSeeker();
    //Assuming names are unique.
    boolean result = JobseekerCol.replaceOne(Filters.eq("useracc.username", s.getUseracc().getUsername()), doc1).wasAcknowledged(); 
     System.out.println("Student list Updated.");
    return x;
    }
       
        
       
       
    
       
    
       
       
        public Company getCompany(String Username, String Password){
         ArrayList<Document> doc2 = new ArrayList<Document>(); 
         ArrayList<Company> result = new ArrayList<Company>(); 
         doc2 = CompanyCol.find().into(new ArrayList<Document>());
          Company x = new Company();
         boolean isFound = false;
       for (int i = 0; i < doc2.size(); i++) {
           
           result.add( gson.fromJson(doc2.get(i).toJson(), Company.class));
        }
        for (int i = 0; i < result.size(); i++) {
         if(result.get(i).getUseracc().getUsername().equals(Username)){
           x = result.get(i);
          return x;     
           
            
        }
        }
         //Document jbsobj = JobseekerCol.find( Filters.eq("useracc"));
        
     return x;
    
    
    }
    

    public void insertCompany(Company s) {
        //s = gson.fromJson(doc.toJson(), Student.class);
        //Document doc1 = JobseekerCol.find(Filters.eq("Email", )).first();
        CompanyCol.insertOne(Document.parse(gson.toJson(s)));
        System.out.println("Company: " + s.getUseracc().getUsername() + s.getName() + s.getCompID()+ " Added");

    }
        public void insertJob(Job j) {
        //s = gson.fromJson(doc.toJson(), Student.class);
        //Document doc1 = JobseekerCol.find(Filters.eq("Email", )).first();
        JOBCOL.insertOne(Document.parse(gson.toJson(j)));
        System.out.println("Job: " + j.getCategory()+j.getDescription()+j.getDuration()+ " Added");

    }
        
    
         public void insertApplication(Application A) {
        //s = gson.fromJson(doc.toJson(), Student.class);
        //Document doc1 = JobseekerCol.find(Filters.eq("Email", )).first();
        APPcol.insertOne(Document.parse(gson.toJson(A)));
        System.out.println("Application: " + A.getApplicant()+A.getApplicationStatus()+A.getQuestionList()+ " Added");

    }
    

   public void deleteJobSeeker(int JSid ) {
   boolean result = JobseekerCol.deleteOne(Filters.eq("JSid", JSid)).wasAcknowledged();
   }
   public void deleteCompany(int compID ) {
   boolean result = CompanyCol.deleteOne(Filters.eq("compID", compID)).wasAcknowledged();
   }
   public void deleteJob(int JID ) {
   boolean result = JOBCOL.deleteOne(Filters.eq("ID", JID)).wasAcknowledged();
   }
     public void deleteApplication(int AID ) {
   boolean result = APPcol.deleteOne(Filters.eq("ID", AID)).wasAcknowledged();
   }

//
    public JobSeeker getJobSeekerByID(int id ) {
        
 Document doc1 = JobseekerCol.find(Filters.eq("JSid", id)).first();
     JobSeeker x = gson.fromJson(doc1.toJson(), JobSeeker.class);
     return x;
        }

     public Company getCompanyByID(int id ) {
        
 Document doc1 = CompanyCol.find(Filters.eq("compID", id)).first();
     Company x = gson.fromJson(doc1.toJson(), Company.class);
     return x;
        } 
    
      public Job getJobByID(int id ) {
        
     Document doc1 = JOBCOL.find(Filters.eq("ID", id)).first();
     Job x = gson.fromJson(doc1.toJson(), Job.class);
     return x;
        }
    
    
      public Application getApplicationByID(int id ) {
        
     Document doc1 = APPcol.find(Filters.eq("ID", id)).first();
     Application x = gson.fromJson(doc1.toJson(), Application.class);
     return x;
        }
    
    



}
