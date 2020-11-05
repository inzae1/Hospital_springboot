new Vue({
    el: "#app",
    data: {
        isLogin: false
    },
    mounted() {
        if (localStorage.getItem("animal_login") != null) {
            this.isLogin = true;
        }
    },
    methods: {
        logout() {
            let con_logout = confirm("로그아웃 하시겠습니까");
            if (con_logout) {
                localStorage.removeItem("animal_login");
                localStorage.removeItem("animal_admin");
                location.reload(true);
            }
        }
    }
});