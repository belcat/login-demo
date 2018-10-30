<#include "layout/header.ftl">

<div>
    <form id="loginForm" @submit.prevent="login">
        <label>nickname</label>
        <input type="text" v-model="nickname" />
        <input type="submit" value="login">
        <p>* john 입력하면 로그인 됨</p>
    </form>
</div>

<#include "layout/script.ftl">

<script type="text/javascript" src="/js/login.js"></script>

<#include "layout/footer.ftl">
