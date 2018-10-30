axios.get( '/users/session' )
  .then( function( user ) {
    new Vue( {
      el: '#updateForm',
      data: {
        nickname: user.data.nickname,
      },
      methods: {
        update: function () {
          axios.put( '/users/' + user.data.id, {
            id: user.data.id,
            nickname: this.nickname
          } )
          .then( function() {
            document.location.href = '/';
          } );
        }
      }
    } );
  } );