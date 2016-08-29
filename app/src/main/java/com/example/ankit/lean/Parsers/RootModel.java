import java.util.ArrayList;

class RootModel {

	public String logo;
	public CopyrightModel _copyright;
	public String description;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String type;
	public String end_time;
	public String schedule_published_on;
	public String email;
	public String location_name;
	public String timezone;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public String background_image;
	public String name;
	public CreatorModel _creator;
	public String topic;
	public String privacy;
	public String organizer_description;
	public String organizer_name;

	public RootModel(String logo, CopyrightModel copyright, String description, String code_of_conduct, ArrayList<Social_linksModel> social_links, String state, String type, String end_time, String schedule_published_on, String email, String location_name, String timezone, int id, Call_for_papersModel call_for_papers, VersionModel version, String start_time, String background_image, String name, CreatorModel creator, String topic, String privacy, String organizer_description, String organizer_name) {

		this.logo = logo;
		this._copyright = copyright;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.background_image = background_image;
		this.name = name;
		this._creator = creator;
		this.topic = topic;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;

	}

}