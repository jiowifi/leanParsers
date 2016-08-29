import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public int id;
	public String state;
	public String organizer_name;
	public String organizer_description;
	public VersionModel _version;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String timezone;
	public String location_name;
	public String background_image;
	public String logo;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String email;
	public String privacy;
	public String name;
	public String description;
	public String start_time;
	public String type;

	public RootModel(Call_for_papersModel call_for_papers, String code_of_conduct, int id, String state, String organizer_name, String organizer_description, VersionModel version, String end_time, ArrayList<Social_linksModel> social_links, String topic, String timezone, String location_name, String background_image, String logo, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String email, String privacy, String name, String description, String start_time, String type) {

		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.state = state;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._version = version;
		this.end_time = end_time;
		this.social_links = social_links;
		this.topic = topic;
		this.timezone = timezone;
		this.location_name = location_name;
		this.background_image = background_image;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.email = email;
		this.privacy = privacy;
		this.name = name;
		this.description = description;
		this.start_time = start_time;
		this.type = type;

	}

}