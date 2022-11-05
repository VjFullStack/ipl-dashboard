libraries{tree/Sem3/Sem3

  maven{
    
    prdversion ='1.0.0-SNAPSHOT'
    prdname = 'ipl-dashboard-service'
    jdk_toolname= "openjdk17"
  
  }
  
  containerize
  {
    image_name = 'ipl-dashboard'
    image_tag = ['1.0.0-${BUILD_NUMBER}']
  }

  email{
      to = 'arpan.tyagi@gmail.com,sindhu.yadav@gmail.com,viraj.salokhe@gmail.com,ravi.ku@gmail.com'
    }


}
