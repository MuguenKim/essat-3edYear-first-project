import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";


@Injectable({
  providedIn: 'root'
})
export class ServiceManager{

  constructor(private http: HttpClient) { }

  getAllPfe(){
    return this.http.get("http://127.0.0.1:8081/rest/pfe/")
  }

  getPfe(id:number){
    return this.http.get("http://127.0.0.1:8081/rest/pfe/"+id)
  }

  getPfeByCategory(id:number){
    return this.http.get("http://127.0.0.1:8081/rest/pfe/type/"+id)
  }

  getPfeByTitle(str: string){
    return this.http.get("http://127.0.0.1:8081/rest/pfe/title/"+str)
  }

  postPfe(pfe: any){
    return this.http.post("http://127.0.0.1:8081/rest/pfe/", pfe)
  }

  deletePfe(id:number){
    return this.http.delete("http://127.0.0.1:8081/rest/pfe/"+id)
  }

  getAllType(){
    return this.http.get("http://127.0.0.1:8081/rest/type/")
  }

  getType(id:number){
    return this.http.get("http://127.0.0.1:8081/rest/type/"+id)
  }


  
}