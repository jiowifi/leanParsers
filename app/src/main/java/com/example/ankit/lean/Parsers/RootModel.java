import java.util.ArrayList;

class RootModel {

	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String type;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String name;
	public VersionModel _version;
	public String logo;
	public String topic;
	public int id;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_description;
	public String location_name;
	public String organizer_name;
	public String schedule_published_on;
	public String start_time;
	public CreatorModel _creator;
	public String description;
	public String state;

	public RootModel(String email, CopyrightModel copyright, String code_of_conduct, String type, String end_time, Call_for_papersModel call_for_papers, String timezone, String name, VersionModel version, String logo, String topic, int id, String background_image, ArrayList<Social_linksModel> social_links, String privacy, String organizer_description, String location_name, String organizer_name, String schedule_published_on, String start_time, CreatorModel creator, String description, String state) {

		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.name = name;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this.background_image = background_image;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._creator = creator;
		this.description = description;
		this.state = state;

	}

}