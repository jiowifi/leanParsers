import java.util.ArrayList;

class RootModel {

	public String logo;
	public String schedule_published_on;
	public String state;
	public String name;
	public String background_image;
	public String code_of_conduct;
	public String end_time;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public CreatorModel _creator;
	public String type;
	public String start_time;
	public String topic;
	public String organizer_name;
	public String email;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String timezone;
	public String organizer_description;

	public RootModel(String logo, String schedule_published_on, String state, String name, String background_image, String code_of_conduct, String end_time, VersionModel version, CopyrightModel copyright, int id, Call_for_papersModel call_for_papers, String privacy, CreatorModel creator, String type, String start_time, String topic, String organizer_name, String email, String description, ArrayList<Social_linksModel> social_links, String location_name, String timezone, String organizer_description) {

		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.name = name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._version = version;
		this._copyright = copyright;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._creator = creator;
		this.type = type;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.email = email;
		this.description = description;
		this.social_links = social_links;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;

	}

}