
<jsp:include page="header.jsp"></jsp:include>
    <jsp:include page="footer.jsp"></jsp:include>


 <!DOCTYPE html>
 <html>
 <head>
     <meta charset="utf-8">
     <title>RegistrationForm_v7 by Colorlib</title>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">

     <!-- MATERIAL DESIGN ICONIC FONT -->
     <link rel="stylesheet" href="public/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

     <!-- STYLE CSS -->
     <link rel="stylesheet" href="public/css/style.css">
 </head>

 <body>

 <div class="wrapper">
     <div class="inner">
         <form action="/Produit" method="post">
             <h3>GESTION STOCK</h3>
             <label class="form-group">
                 <input type="text" class="form-control"  required name="nom">
                 <span>NOM PRODUIT</span>
                 <span class="border"></span>
             </label>
             <label class="form-group">
                 <input type="text" class="form-control"  required name="qtStock">
                 <span for="">QUANTITE STOCK</span>
                 <span class="border"></span>
             </label>

             <button type="submit">ENREGISTRER

                 <i class="zmdi zmdi-arrow-right"></i>
             </button>
         </form>
     </div>
 </div>

 </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
 </html>