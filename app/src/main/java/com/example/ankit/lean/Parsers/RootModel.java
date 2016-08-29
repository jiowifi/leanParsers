import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String timezone;
	public String start_time;
	public String organizer_description;
	public String location_name;
	public String code_of_conduct;
	public String organizer_name;
	public String state;
	public String logo;
	public String privacy;
	public CreatorModel _creator;
	public int id;
	public String name;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String end_time;
	public String email;
	public String background_image;
	public String type;
	public String topic;
	public String description;

	public RootModel(ArrayList<Social_linksModel> social_links, VersionModel version, String timezone, String start_time, String organizer_description, String location_name, String code_of_conduct, String organizer_name, String state, String logo, String privacy, CreatorModel creator, int id, String name, CopyrightModel copyright, Call_for_papersModel call_for_papers, String schedule_published_on, String end_time, String email, String background_image, String type, String topic, String description) {

		this.social_links = social_links;
		this._version = version;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;
		this._creator = creator;
		this.id = id;
		this.name = name;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.type = type;
		this.topic = topic;
		this.description = description;

	}

}