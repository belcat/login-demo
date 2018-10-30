<#include "layout/header.ftl">

<#if user?has_content>
    <p>Hello, ${user.nickname}!</p>
    <a href="/change">닉네임변경</a><br>
    <a href="/logout">로그아웃</a>
<#else>
    <p>Hello, World !</p>
    <a href="/login">로그인</a>
</#if>

<#include "layout/footer.ftl">