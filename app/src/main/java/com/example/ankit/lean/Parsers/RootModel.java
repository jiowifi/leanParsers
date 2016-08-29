import java.util.ArrayList;

class RootModel {

	public String name;
	public String description;
	public String state;
	public String code_of_conduct;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String background_image;
	public String email;
	public String logo;
	public String location_name;
	public CreatorModel _creator;
	public String timezone;
	public String start_time;
	public String organizer_description;
	public String topic;
	public CopyrightModel _copyright;
	public String organizer_name;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String type;

	public RootModel(String name, String description, String state, String code_of_conduct, String end_time, Call_for_papersModel call_for_papers, VersionModel version, String background_image, String email, String logo, String location_name, CreatorModel creator, String timezone, String start_time, String organizer_description, String topic, CopyrightModel copyright, String organizer_name, int id, String privacy, String schedule_published_on, ArrayList<Social_linksModel> social_links, String type) {

		this.name = name;
		this.description = description;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.background_image = background_image;
		this.email = email;
		this.logo = logo;
		this.location_name = location_name;
		this._creator = creator;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.type = type;

	}

}