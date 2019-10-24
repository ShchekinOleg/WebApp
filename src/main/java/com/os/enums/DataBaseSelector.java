package com.os.enums;

public enum DataBaseSelector {
    MY_SQL {
        @Override
        public String toString() {
            return "MySQL";
        }
    },
    MS_SQL {
        @Override
        public String toString() {
            return "Microsoft SQL Server";
        }
    },
    ORACLE {
        @Override
        public String toString() {
            return "Oracle Database";
        }
    },
    POSTGRES {
        @Override
        public String toString() {
            return "PostgreSQL";
        }
    }
}
