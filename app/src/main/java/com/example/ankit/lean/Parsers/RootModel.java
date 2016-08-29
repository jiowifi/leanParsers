import java.util.ArrayList;

class RootModel {

	public String start_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String description;
	public String name;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public String topic;
	public int id;
	public String organizer_description;
	public String schedule_published_on;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public String email;
	public String background_image;
	public String logo;

	public RootModel(String start_time, CopyrightModel copyright, String timezone, String description, String name, String code_of_conduct, String state, VersionModel version, String topic, int id, String organizer_description, String schedule_published_on, String location_name, Call_for_papersModel call_for_papers, String type, CreatorModel creator, ArrayList<Social_linksModel> social_links, String organizer_name, String privacy, String end_time, String email, String background_image, String logo) {

		this.start_time = start_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.description = description;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this.topic = topic;
		this.id = id;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._creator = creator;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.logo = logo;

	}

}