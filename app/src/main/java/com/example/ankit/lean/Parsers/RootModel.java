import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String type;
	public String topic;
	public String organizer_name;
	public String logo;
	public String state;
	public String end_time;
	public String description;
	public String schedule_published_on;
	public String email;
	public int id;
	public String name;
	public String background_image;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String privacy;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;
	public String timezone;
	public CreatorModel _creator;

	public RootModel(String code_of_conduct, String type, String topic, String organizer_name, String logo, String state, String end_time, String description, String schedule_published_on, String email, int id, String name, String background_image, CopyrightModel copyright, VersionModel version, String privacy, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time, String timezone, CreatorModel creator) {

		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.state = state;
		this.end_time = end_time;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.id = id;
		this.name = name;
		this.background_image = background_image;
		this._copyright = copyright;
		this._version = version;
		this.privacy = privacy;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.timezone = timezone;
		this._creator = creator;

	}

}