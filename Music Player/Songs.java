package com.jspider.project.musicplayer;
public class Songs {
	
	//properties 
		String songName;
		int songId;
		String songArtist;
		
	//constructor 
		public Songs(int songId,String songName,String songArtist) {
			this.songId=songId;
			this.songName=songName;
			this.songArtist=songArtist;
		}
		
//		getters and setters
		public int getSongId() {
			return songId;
		}
		public void setSongId(int songId) {
			this.songId = songId;
		}
		public String getSongArtist() {
			return songArtist;
		}
		public void setSongArtist(String songArtist) {
			this.songArtist = songArtist;
		}
		public String getSongName() {
			return songName;
		}
		public void setSongName(String songName) {
			this.songName = songName;
		}

	}