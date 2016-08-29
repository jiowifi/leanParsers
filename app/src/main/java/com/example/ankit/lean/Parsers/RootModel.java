import java.util.ArrayList;

class RootModel {

	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String schedule_published_on;
	public String description;
	public String end_time;
	public String timezone;
	public String start_time;
	public String privacy;
	public String background_image;
	public String name;
	public VersionModel _version;
	public String organizer_description;
	public String email;
	public String type;
	public String topic;
	public String state;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public CreatorModel _creator;

	public RootModel(String logo, Call_for_papersModel call_for_papers, String location_name, CopyrightModel copyright, String code_of_conduct, String schedule_published_on, String description, String end_time, String timezone, String start_time, String privacy, String background_image, String name, VersionModel version, String organizer_description, String email, String type, String topic, String state, String organizer_name, ArrayList<Social_linksModel> social_links, int id, CreatorModel creator) {

		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.end_time = end_time;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.name = name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.email = email;
		this.type = type;
		this.topic = topic;
		this.state = state;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.id = id;
		this._creator = creator;

	}

}