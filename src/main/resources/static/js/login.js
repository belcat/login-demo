new Vue( {
  el: '#loginForm',
  data: {
    nickname: '',
  },
  methods: {
    login: function () {
      axios.post( '/users/authentication', {
        nickname: this.nickname
      } )
      .then( function() {
        document.location.href = '/';
      }, function() {
        alert('실패');
      } );
    }
  }
} );