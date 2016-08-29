import java.util.ArrayList;

class RootModel {

	public String privacy;
	public VersionModel _version;
	public String start_time;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;
	public String topic;
	public String end_time;
	public int id;
	public String description;
	public String organizer_description;
	public String logo;
	public String location_name;
	public String organizer_name;
	public String schedule_published_on;
	public String type;
	public String code_of_conduct;
	public String background_image;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CreatorModel _creator;

	public RootModel(String privacy, VersionModel version, String start_time, String timezone, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state, String topic, String end_time, int id, String description, String organizer_description, String logo, String location_name, String organizer_name, String schedule_published_on, String type, String code_of_conduct, String background_image, String name, ArrayList<Social_linksModel> social_links, String email, CreatorModel creator) {

		this.privacy = privacy;
		this._version = version;
		this.start_time = start_time;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;
		this.topic = topic;
		this.end_time = end_time;
		this.id = id;
		this.description = description;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.name = name;
		this.social_links = social_links;
		this.email = email;
		this._creator = creator;

	}

}