function loadNavbar() {
    var navbarNode = document.getElementById("navbar");
    navbarNode.innerHTML =
        "<nav  class = 'advanced-nav menu'><ul>" +

        "<li> <a href = 'tab01_home'><div  class = 'icon'><img class = 'portrait' src = '../images/home/home.png' > </div>" +
        "<div class='button-text' style='padding-left: 2em;'>   Pizza<span>DELIVERY</span>  </div>  </a> </li>" +

        "<li>  <a href='tab02_menu'>  <div class='icon'> <img class='myLogo' src='../images/home/menu.png'></div> " +
        "<div class='button-text'> Menu <span> All your favorite pizza's!</span> </div> </a> </li> " +


        "<li><a href='tab03_create'> <div class='icon'> <img class='myLogo' src='../images/home/create.png'></div>" +
        "<div class='button-text'> Create <span>your own pizza!</span>  </div>    </a></li>" +

        "<li><a href ='tab04_contact' ><div class = 'icon'> <img class ='myLogo' src ='../images/home/contact.png'></div>" +
        "<div class='button-text'> Contact <span>us</span> </div> </a></li>" +

        "<li> <a href='tab05_employees'><div class='icon'><img class='myLogo' src='../images/home/team.png'></div>" +
        "<div class='button-text'>Our Team <span>You can count on them</span> </div></a></li>" +


        "<li><a href='tab06_accounting'><div class='icon'><img class='myLogo' src='../images/home/accounting.png'></div>" +
        "<div class='button-text'>Accounting <span>See our activity</span> </div></a></li>"+

        "</ul></nav>";
}

window.addEventListener('load', loadNavbar)
