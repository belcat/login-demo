<#include "../layout/header.ftl">

<div>
    <form id="updateForm" @submit.prevent="update">
        <label>nickname</label>
        <input type="text" v-model="nickname" />
        <input type="submit" value="update">
    </form>
</div>

<#include "../layout/script.ftl">

<script type="text/javascript" src="/js/update.js"></script>

<#include "../layout/footer.ftl">
