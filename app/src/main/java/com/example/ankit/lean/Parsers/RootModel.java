import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String type;
	public CreatorModel _creator;
	public String logo;
	public String organizer_name;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String schedule_published_on;
	public String location_name;
	public VersionModel _version;
	public String timezone;
	public String background_image;
	public String state;
	public String email;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String topic;
	public String start_time;

	public RootModel(String end_time, String name, CopyrightModel copyright, String organizer_description, String type, CreatorModel creator, String logo, String organizer_name, String code_of_conduct, Call_for_papersModel call_for_papers, String description, String schedule_published_on, String location_name, VersionModel version, String timezone, String background_image, String state, String email, String privacy, ArrayList<Social_linksModel> social_links, int id, String topic, String start_time) {

		this.end_time = end_time;
		this.name = name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.type = type;
		this._creator = creator;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._version = version;
		this.timezone = timezone;
		this.background_image = background_image;
		this.state = state;
		this.email = email;
		this.privacy = privacy;
		this.social_links = social_links;
		this.id = id;
		this.topic = topic;
		this.start_time = start_time;

	}

}