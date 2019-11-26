package allFriendsGroupId;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FriendEnum {
    Oana {
        @Override
        public String getEmail() {
            return "oana.teodora.cretu@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Sil {
        @Override
        public String getEmail() {
            return "silvian.cretu@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Ema {
        @Override
        public String getEmail() {
            return "silvian.cretu@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Ana {
        @Override
        public String getEmail() {
            return "oana.teodora.cretu@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Luky {
        @Override
        public String getEmail() {
            return "miriam.jaradat@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Bobo {
        @Override
        public String getEmail() {
            return "bogdan.bucevschi@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Mambo {
        @Override
        public String getEmail() {
            return "bogdan.bucevschi@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Nina {
        @Override
        public String getEmail() {
            return "miriam.jaradat@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Ale {
        @Override
        public String getEmail() {
            return "alexandra.toma86@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Lucas {
        @Override
        public String getEmail() {
            return "alexandra.toma86@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Septi {
        @Override
        public String getEmail() {
            return "septimiu.cernat@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Anastasia {
        @Override
        public String getEmail() {
            return "septimiu.cernat@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Ramona {
        @Override
        public String getEmail() {
            return "ramona.bucevschi@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Mia {
        @Override
        public String getEmail() {
            return "ramona.bucevschi@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Dragos {
        @Override
        public String getEmail() {
            return "dragos.bucevschi@gmail.com";
        }
        @Override
        public boolean isAssigned() {
            return false;
        }
    },
    Edi {
        @Override
        public String getEmail() {
          return "dragos.bucevschi@gmail.com";
        }

        @Override
        public boolean isAssigned() {
          return false;
        }
    };

    public String getEmail() {
        return "";
    }
    public boolean isAssigned() {
        return true;
    }
}
