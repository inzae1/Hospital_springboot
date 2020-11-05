function isLogin() {
    let isLogin = localStorage.getItem("animal_login");
    if (isLogin == null) {
        console.log(document.getElementById("loginCheck"));
        document.getElementById("loginCheck").innerHTML("<li><a href='login.html><h2>로그인</h2></a></li><li><a href='register.html><h2>회원가입</h2></a></li>");

    } else {
        document.getElementById("loginCheck").innerHTML("<li><a href='login.html><h2>로그인</h2></a></li><li><a href='mypage.html'><h2>마이페이지</h2></a></li>");
    }
}