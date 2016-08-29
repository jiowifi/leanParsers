import java.util.ArrayList;

class RootModel {

	public String email;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String name;
	public int id;
	public String organizer_name;
	public String location_name;
	public String topic;
	public VersionModel _version;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String state;
	public String logo;
	public String privacy;
	public String end_time;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public String timezone;
	public String schedule_published_on;
	public CreatorModel _creator;

	public RootModel(String email, String background_image, Call_for_papersModel call_for_papers, String start_time, String name, int id, String organizer_name, String location_name, String topic, VersionModel version, String organizer_description, ArrayList<Social_linksModel> social_links, String code_of_conduct, String state, String logo, String privacy, String end_time, CopyrightModel copyright, String type, String description, String timezone, String schedule_published_on, CreatorModel creator) {

		this.email = email;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.name = name;
		this.id = id;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.topic = topic;
		this._version = version;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;
		this.end_time = end_time;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;

	}

}