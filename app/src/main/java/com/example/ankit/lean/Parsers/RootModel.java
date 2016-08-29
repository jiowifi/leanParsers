import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String description;
	public String email;
	public String location_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public CreatorModel _creator;
	public String type;
	public String code_of_conduct;
	public String privacy;
	public String timezone;
	public String background_image;
	public String start_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public VersionModel _version;

	public RootModel(String end_time, String logo, String organizer_name, String schedule_published_on, CopyrightModel copyright, String organizer_description, String description, String email, String location_name, String topic, ArrayList<Social_linksModel> social_links, int id, CreatorModel creator, String type, String code_of_conduct, String privacy, String timezone, String background_image, String start_time, String name, Call_for_papersModel call_for_papers, String state, VersionModel version) {

		this.end_time = end_time;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.description = description;
		this.email = email;
		this.location_name = location_name;
		this.topic = topic;
		this.social_links = social_links;
		this.id = id;
		this._creator = creator;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.timezone = timezone;
		this.background_image = background_image;
		this.start_time = start_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._version = version;

	}

}