import java.util.ArrayList;

class RootModel {

	public String state;
	public String timezone;
	public String description;
	public String schedule_published_on;
	public String type;
	public CreatorModel _creator;
	public VersionModel _version;
	public String organizer_description;
	public String logo;
	public String email;
	public int id;
	public String topic;
	public String location_name;
	public String name;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String end_time;
	public String privacy;
	public String code_of_conduct;
	public String organizer_name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String state, String timezone, String description, String schedule_published_on, String type, CreatorModel creator, VersionModel version, String organizer_description, String logo, String email, int id, String topic, String location_name, String name, CopyrightModel copyright, Call_for_papersModel call_for_papers, String background_image, String end_time, String privacy, String code_of_conduct, String organizer_name, String start_time, ArrayList<Social_linksModel> social_links) {

		this.state = state;
		this.timezone = timezone;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._creator = creator;
		this._version = version;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.email = email;
		this.id = id;
		this.topic = topic;
		this.location_name = location_name;
		this.name = name;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.end_time = end_time;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.social_links = social_links;

	}

}