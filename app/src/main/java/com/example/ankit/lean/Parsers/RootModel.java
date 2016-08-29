import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String email;
	public String organizer_description;
	public String state;
	public CreatorModel _creator;
	public int id;
	public String organizer_name;
	public String name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String location_name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String topic;
	public String background_image;
	public String description;
	public String privacy;
	public String timezone;
	public String start_time;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;

	public RootModel(String end_time, String email, String organizer_description, String state, CreatorModel creator, int id, String organizer_name, String name, String code_of_conduct, CopyrightModel copyright, String location_name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String logo, String topic, String background_image, String description, String privacy, String timezone, String start_time, String type, Call_for_papersModel call_for_papers, VersionModel version) {

		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this.state = state;
		this._creator = creator;
		this.id = id;
		this.organizer_name = organizer_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.logo = logo;
		this.topic = topic;
		this.background_image = background_image;
		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.start_time = start_time;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._version = version;

	}

}