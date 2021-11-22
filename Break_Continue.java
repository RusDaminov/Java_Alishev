
public class Break_Continue {
    public static void main(String[] args) {
//        int i = 0;
//        while(true){
//            if(i==16)
//                break;
//            System.out.println(i);
//            i++;
//        }
    for(int i = 0; i<=15; i++){
        if(i%2==0){
            continue;
        }
        System.out.println("this number is odd "+i);
    }
    }
}

//ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCpP3JtBBjKK5AYOWT/4VCDu3kFxOYl2OEVCwMhVb9N8qFhLHE6RwJOu+ZNLrUqtNt7D3QSoDkk2X2KN8o7/HxXrMe1JpvIJ5n9P6YpYrdjqnWjy7HHUHCYUVOJEQVyuP3GCaGKxoeOyitb2zXWWVX4OeMJACtGP0cCqlA3jl40ylLaGW4OxWjSYrqwtQ1sJyjK1H9J3YE8d5/3l7olm2SqupKPO3W9l6MO121ANQDhxz596ZM3zHku55ysBeOFQ/imh/vLaggCgdKGqPG4Kt1F5B1cRDUn341kWzPm1Myb6nSlc4DoDfDZj6sALFI9y/7VC8TZTi70+h9awcALrjEx abernita@ge-e5.kzn.21-school.ru
//
//
//
//        curl  -H "Authorization: Bearer YOUR_ACCESS_TOKEN" "https://api.intra.42.fr/v2/campus/3"
//uid       8b81ffb7c8f3c48a2155b0c2f27cb6e3583fc813068148126338b7c223a7e571
//        secret      a36d35ec70c5651ccc78ac4f64448d00702516e9a8fb24cae6776fd3f7678e71
//
//        {"access_token":"7642c96d5b94bfcdb72cf7d129f88a2e5a0e4f2c9a2f6d20bcb51cb95feba3b2","token_type":"bearer","expires_in":7182,"scope":"public","created_at":1636850528}%
//
//
//
//        curl -H "Authorization: Bearer 7642c96d5b94bfcdb72cf7d129f88a2e5a0e4f2c9a2f6d20bcb51cb95feba3b2" https://api.intra.42.fr/oauth/token/info
//        {"resource_owner_id":null,"scopes":["public"],"expires_in_seconds":6987,"application":{"uid":"8b81ffb7c8f3c48a2155b0c2f27cb6e3583fc813068148126338b7c223a7e571"},"created_at":1636850528}%
//        curl -X POST --data "grant_type=client_credentials&client_id=8b81ffb7c8f3c48a2155b0c2f27cb6e3583fc813068148126338b7c223a7e571&client_secret=a36d35ec70c5651ccc78ac4f64448d00702516e9a8fb24cae6776fd3f7678e71" https://api.intra.42.fr/oauth/token