import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CreatorModel _creator;
	public String state;
	public int id;
	public String start_time;
	public String privacy;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String logo;
	public String name;
	public String description;
	public String end_time;
	public String topic;
	public VersionModel _version;
	public String timezone;
	public String code_of_conduct;
	public String type;

	public RootModel(String background_image, CreatorModel creator, String state, int id, String start_time, String privacy, String organizer_name, CopyrightModel copyright, String schedule_published_on, Call_for_papersModel call_for_papers, String location_name, String email, ArrayList<Social_linksModel> social_links, String organizer_description, String logo, String name, String description, String end_time, String topic, VersionModel version, String timezone, String code_of_conduct, String type) {

		this.background_image = background_image;
		this._creator = creator;
		this.state = state;
		this.id = id;
		this.start_time = start_time;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.email = email;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.name = name;
		this.description = description;
		this.end_time = end_time;
		this.topic = topic;
		this._version = version;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.type = type;

	}

}